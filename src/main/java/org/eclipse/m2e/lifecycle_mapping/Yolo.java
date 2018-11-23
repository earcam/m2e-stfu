package org.eclipse.m2e.lifecycle_mapping;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "oh_noes", requiresProject = true, threadSafe = true, requiresDirectInvocation = true)
public class Yolo extends AbstractMojo {

	private static final String FAIL = "[m2e.stfu] Something's gone seriously wrong";

	public void execute() throws MojoExecutionException, MojoFailureException
	{
		getLog().error(FAIL);
		throw new MojoFailureException(FAIL);
	}
}