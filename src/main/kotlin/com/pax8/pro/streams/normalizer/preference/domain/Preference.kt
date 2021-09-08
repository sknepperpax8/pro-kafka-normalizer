package com.pax8.pro.streams.normalizer.preference.domain;

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*

@Data
@NoArgsConstructor
@AllArgsConstructor
data class Preference (
    val userId: UUID,
    val ignore: Boolean
)
