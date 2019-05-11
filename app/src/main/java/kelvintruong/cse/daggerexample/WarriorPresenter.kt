package kelvintruong.cse.daggerexample

class WarriorPresenter(val warrior: Warrior) {
    fun updateWarrior(name: String) {
        warrior.name = name
    }
}