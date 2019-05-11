package kelvintruong.cse.daggerexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_warrior.*
import javax.inject.Inject

class WarriorActivity : AppCompatActivity() {

    private val TAG = "WarriorActivity"

    @Inject
    lateinit var presenter: WarriorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warrior)

        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
        val warriorScreenComponent = DaggerWarriorScreenComponent.builder()
            .appComponent(appComponent)
            .build()
        warriorScreenComponent.inject(this)

        presenter.updateWarrior("Update Warrior mới")
        txtLogActivityScope.text = presenter.warrior.name
        Log.d(TAG, presenter.warrior.name)
    }
}