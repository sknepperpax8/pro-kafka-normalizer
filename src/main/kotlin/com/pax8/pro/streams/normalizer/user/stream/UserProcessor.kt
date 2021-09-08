package com.pax8.pro.streams.normalizer.user.stream

import com.pax8.pro.streams.normalizer.preference.domain.Preference
import com.pax8.pro.streams.normalizer.preference.domain.UserWithPreference
import com.pax8.pro.streams.normalizer.preference.stream.UserPreferenceJoiner
import com.pax8.pro.streams.normalizer.user.domain.User
import lombok.AllArgsConstructor
import org.apache.kafka.streams.kstream.GlobalKTable
import org.apache.kafka.streams.kstream.KStream
import org.springframework.stereotype.Component
import java.util.*
import java.util.function.BiFunction


@AllArgsConstructor
@Component("userProcessor")
class UserProcessor : BiFunction<KStream<String?, User?>, GlobalKTable<UUID?, Preference?>?, KStream<String?, UserWithPreference>> {

    override fun apply(
        userStream: KStream<String?, User?>,
        preferencesTable: GlobalKTable<UUID?, Preference?>?): KStream<String?, UserWithPreference> {
        return userStream
            .leftJoin(preferencesTable, { _, user -> user?.id }, UserPreferenceJoiner())
            .filterNot { _, userWithPreference -> userWithPreference.ignore }
    }
}
