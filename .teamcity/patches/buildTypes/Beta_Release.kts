package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.vcsLabeling
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Beta_Release'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Beta_Release")) {
    features {
        remove {
            vcsLabeling {
                id = "BUILD_EXT_11"
                vcsRootId = "${DslContext.settingsRoot.id}"
                labelingPattern = "%env.Version%"
                successfulOnly = true
                branchFilter = ""
            }
        }
    }
}
