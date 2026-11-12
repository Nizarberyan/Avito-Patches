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

/**
 * `ListingAd.DfpBanner.toString()`, the list item of a Google Ad Manager banner
 * shown between the search results.
 */
internal object DfpBannerListingToStringFingerprint : Fingerprint(
    name = "toString",
    returnType = "Ljava/lang/String;",
    parameters = listOf(),
    filters = listOf(
        string("DfpBanner(uuid="),
    ),
)

/**
 * Banner view of the Google Mobile Ads SDK. Class and method names are part of
 * the public SDK api and are not obfuscated.
 */
internal object BaseAdViewOnMeasureFingerprint : Fingerprint(
    definingClass = "Lcom/google/android/gms/ads/BaseAdView;",
    name = "onMeasure",
    returnType = "V",
    parameters = listOf("I", "I"),
)

/**
 * Methods of the Google Mobile Ads SDK that request an ad from the ad network.
 * Each entry is a defining class and a method name, all overloads are matched.
 */
internal val adRequestMethods = listOf(
    "Lcom/google/android/gms/ads/BaseAdView;" to "loadAd",
    "Lcom/google/android/gms/ads/admanager/AdManagerAdView;" to "loadAd",
    "Lcom/google/android/gms/ads/AdLoader;" to "loadAd",
    "Lcom/google/android/gms/ads/AdLoader;" to "loadAds",
    "Lcom/google/android/gms/ads/interstitial/InterstitialAd;" to "load",
    "Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;" to "load",
    "Lcom/google/android/gms/ads/appopen/AppOpenAd;" to "load",
)
