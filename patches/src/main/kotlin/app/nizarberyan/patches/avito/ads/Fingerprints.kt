package app.nizarberyan.patches.avito.ads

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.string

/**
 * Ad visibility store method that decides if the home screen sticky banner
 * of a campaign may be shown, based on the "hide until" timestamp saved
 * in shared preferences:
 *
 * `boolean shouldShowStickyBanner(String campaignId)`
 *
 * The coroutine that writes the same preference key returns an Object,
 * so the boolean return type keeps this match unique.
 */
internal object ShouldShowStickyBannerFingerprint : Fingerprint(
    returnType = "Z",
    parameters = listOf("Ljava/lang/String;"),
    filters = listOf(
        string("sticky_banner_hide_until_campaign_"),
    ),
)
