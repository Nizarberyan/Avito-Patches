package app.nizarberyan.patches.avito.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.patch
import app.nizarberyan.patches.avito.shared.Constants.COMPATIBILITY_AVITO

@Suppress("unused")
val hideStickyBannerPatch = patch(
    name = "Hide sticky banner",
    description = "Removes the sponsored campaign banner pinned above the search bar on the home screen.",
    default = true,
) {
    compatibleWith(COMPATIBILITY_AVITO)

    execute {
        // Report every campaign as hidden. The ad manager then publishes an empty
        // image url and a false visibility flag, so the banner is never composed.
        ShouldShowStickyBannerFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """,
        )
    }
}
