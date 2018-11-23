# m2e-stfu

As a maven plugin author (diligently supplying m2e lifecycle bindings), or Eclipse user (diligently adding m2e to pluginManagement) it kind of slaps-the-face to get:

		[WARNING] The POM for org.eclipse.m2e:lifecycle-mapping:jar:1.0.0 is missing, no dependency information available


		[WARNING] Failed to retrieve plugin descriptor for org.eclipse.m2e:lifecycle-mapping:1.0.0: Plugin org.eclipse.m2e:lifecycle-mapping:1.0.0 or one of its dependencies could not be resolved: Failure to find org.eclipse.m2e:lifecycle-mapping:jar:1.0.0 in https://repo.maven.apache.org/maven2 was cached in the local repository, resolution will not be reattempted until the update interval of central has elapsed or updates are forced

With nothing to fix just work-around.


You can:

* Install this to your local repo (beneficial for you)
* Deploy to your organisation's Maven Repository (beneficial for your tribe)
* Add an indication of your displeasure to this [bugzilla issue](https://bugs.eclipse.org/bugs/show_bug.cgi?id=541521) (beneficial for all)

There's less long-term effort and more socal-value in you opting for the latter.

---

Ask not what Open Source build tools and IDEs can do for you ... (this project exists because you googled the warning).  First [reported 2014](https://bugs.eclipse.org/bugs/show_bug.cgi?id=436530).

---
