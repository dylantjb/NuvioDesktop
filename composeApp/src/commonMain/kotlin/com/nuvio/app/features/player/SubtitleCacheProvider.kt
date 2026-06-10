package com.nuvio.app.features.player

/**
 * Platform-specific subtitle caching for external players.
 */
expect object SubtitleCacheProvider {
    /**
     * Caches subtitle files locally and returns updated [SubtitleInput] list
     * with local URIs instead of remote HTTP URLs.
     */
    suspend fun cacheForExternalPlayer(subtitles: List<SubtitleInput>): List<SubtitleInput>?
}
