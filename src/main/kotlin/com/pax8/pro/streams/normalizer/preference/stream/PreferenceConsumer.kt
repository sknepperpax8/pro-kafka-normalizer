package com.pax8.pro.streams.normalizer.preference.stream;

import com.pax8.pro.streams.normalizer.preference.domain.Preference
import lombok.AllArgsConstructor
import org.apache.kafka.streams.kstream.KStream
import org.springframework.stereotype.Component
import java.util.*
import java.util.function.Consumer

@AllArgsConstructor
@Component("preferenceConsumer")
class PreferenceConsumer : Consumer<KStream<UUID?, Preference?>> {

    override fun accept(stream: KStream<UUID?, Preference?>) {
        stream.peek { key: UUID?, value: Preference? ->
            println("key: $key, value: $value")
        }
    }
}
