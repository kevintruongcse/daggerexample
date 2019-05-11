package kelvintruong.cse.daggerexample

import dagger.Component

@WarriorScreenScope
@Component(modules = [WarriorScreenModule::class],
    dependencies = [AppComponent::class])
interface WarriorScreenComponent {
    fun inject(warriorActivity: WarriorActivity)
}