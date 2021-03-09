package com.example.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun printFunc() : String


}/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor) : MyInterface
}*/

@InstallIn(ApplicationComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun ndProviderFunc(): MyInterface{
        return ndInterfaceImp()
    }

    @Singleton
    @Provides
    fun gSonProvider(): Gson{
        return Gson()
    }

}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor


