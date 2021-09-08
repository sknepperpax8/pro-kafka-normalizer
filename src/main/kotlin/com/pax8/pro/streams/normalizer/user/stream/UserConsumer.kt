package com.pax8.pro.streams.normalizer.user.stream

import com.pax8.pro.streams.normalizer.preference.domain.UserWithPreference
import lombok.AllArgsConstructor
import org.apache.kafka.streams.kstream.KStream
import org.springframework.stereotype.Component
import java.util.*
import java.util.function.Consumer

@AllArgsConstructor
@Component("userConsumer")
class UserConsumer : Consumer<KStream<UUID?, UserWithPreference?>> {

    override fun accept(stream: KStream<UUID?, UserWithPreference?>) {
        stream.peek { key: UUID?, value: UserWithPreference? ->
            println("key: $key, value: $value")
        }
    }
}
