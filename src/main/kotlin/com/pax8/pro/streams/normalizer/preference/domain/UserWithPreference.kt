package com.pax8.pro.streams.normalizer.preference.domain;

import com.pax8.pro.streams.normalizer.user.domain.User
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
data class UserWithPreference (
    val user: User,
    val ignore: Boolean
)
