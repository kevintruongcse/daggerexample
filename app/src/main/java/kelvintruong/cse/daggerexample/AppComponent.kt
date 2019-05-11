package kelvintruong.cse.daggerexample

import dagger.Component

@ApplicationScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getWarrior(): Warrior
}