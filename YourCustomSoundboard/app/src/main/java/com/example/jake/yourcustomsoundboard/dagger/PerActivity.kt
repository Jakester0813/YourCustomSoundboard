package com.example.jake.yourcustomsoundboard.dagger

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
import javax.inject.Scope

/**
 * Created by jake on 1/24/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class PerActivity