package com.pax8.pro.streams.normalizer.user.domain;

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*

@Data
@NoArgsConstructor
@AllArgsConstructor
data class User (
    val id: UUID,
    val name: String,
    val email: String
)
