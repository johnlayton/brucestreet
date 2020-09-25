package com.github.johnlayton.brucestreet

import java.util.Random
import javax.inject.Singleton

@Singleton
class ConferenceService {
  fun randomConf(): Conference {
    return CONFERENCES.get(Random().nextInt(CONFERENCES.size))
  }

  companion object {
    private val CONFERENCES: List<Conference> = listOf(
        Conference("Greach"),
        Conference("GR8Conf EU"),
        Conference("Micronaut Summit"),
        Conference("Devoxx Belgium"),
        Conference("Oracle Code One"),
        Conference("CommitConf"),
        Conference("Codemotion Madrid")
    )
  }
}