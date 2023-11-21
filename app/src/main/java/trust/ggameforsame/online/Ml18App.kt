package trust.ggameforsame.online

import android.app.Application
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig
import dagger.hilt.android.HiltAndroidApp
import pro.userx.UserX
import trust.ggameforsame.online.data.APPS_FLYER
import trust.ggameforsame.online.data.APP_METRICA
import trust.ggameforsame.online.data.MY_TRACKER
import trust.ggameforsame.online.data.USER_X

@HiltAndroidApp
class Ml18App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config = YandexMetricaConfig.newConfigBuilder(APP_METRICA).build()


        MyTracker.initTracker(MY_TRACKER, this)
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
        AppsFlyerLib.getInstance().init(APPS_FLYER, null, this)
        AppsFlyerLib.getInstance().start(this)
        UserX.init(USER_X)
    }
}