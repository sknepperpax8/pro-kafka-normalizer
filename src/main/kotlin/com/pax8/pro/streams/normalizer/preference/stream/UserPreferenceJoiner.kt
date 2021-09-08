package com.pax8.pro.streams.normalizer.preference.stream;

import com.pax8.pro.streams.normalizer.preference.domain.Preference
import com.pax8.pro.streams.normalizer.preference.domain.UserWithPreference
import com.pax8.pro.streams.normalizer.user.domain.User
import org.apache.kafka.streams.kstream.ValueJoiner

class UserPreferenceJoiner : ValueJoiner<User?, Preference?, UserWithPreference> {

    override fun apply(user: User?, preference: Preference?): UserWithPreference {
        val ignore = preference?.ignore ?: false
        return UserWithPreference(user!!, ignore)
    }
}
