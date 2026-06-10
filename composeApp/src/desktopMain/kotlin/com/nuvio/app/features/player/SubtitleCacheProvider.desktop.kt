package com.nuvio.app.features.player

actual object SubtitleCacheProvider {
    /**
     * Desktop external players (such as IINA, VLC, or MPV) can stream remote HTTP/HTTPS
     * subtitle URLs directly, so local caching is not required on this platform.
     */
    actual suspend fun cacheForExternalPlayer(subtitles: List<SubtitleInput>): List<SubtitleInput>? {
        return subtitles
    }
}
