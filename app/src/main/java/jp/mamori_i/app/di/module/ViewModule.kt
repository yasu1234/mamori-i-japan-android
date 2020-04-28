package jp.mamori_i.app.di.module

import jp.mamori_i.app.screen.common.LogoutHelper
import jp.mamori_i.app.screen.common.LogoutHelperImpl
import jp.mamori_i.app.screen.home.HomeViewModel
import jp.mamori_i.app.screen.home.TestBLEViewModel
import jp.mamori_i.app.screen.home.TestContactListViewModel
import jp.mamori_i.app.screen.trace.TraceDataUploadViewModel
import jp.mamori_i.app.screen.trace.TraceHistoryViewModel
import jp.mamori_i.app.screen.menu.MenuViewModel
import jp.mamori_i.app.screen.menu.SettingViewModel
import jp.mamori_i.app.screen.start.SplashViewModel
import jp.mamori_i.app.screen.register.InputPhoneNumberViewModel
import jp.mamori_i.app.screen.register.AuthSmsViewModel
import jp.mamori_i.app.screen.profile.InputPrefectureViewModel
import jp.mamori_i.app.screen.profile.InputJobViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModule = module {

    /* Helpers */
    factory<LogoutHelper> {
        LogoutHelperImpl(get(), get(), get())
    }

    /* ViewModels */
    viewModel {
        HomeViewModel(get(), get(), get())
    }
    viewModel {
        TestBLEViewModel(get())
    }
    viewModel {
        MenuViewModel(get())
    }
    viewModel {
        SettingViewModel(get(), get(), get())
    }
    viewModel {
        AuthSmsViewModel(get(), get())
    }
    viewModel {
        InputPhoneNumberViewModel(get(), get())
    }
    viewModel {
        InputPrefectureViewModel(get(), get(), get())
    }
    viewModel {
        InputJobViewModel(get(), get(), get())
    }
    viewModel {
        SplashViewModel(get(), get(), get(), get())
    }
    viewModel {
        TraceDataUploadViewModel(get(), get(), get())
    }
    viewModel {
        TraceHistoryViewModel(get())
    }
    viewModel {
        TestContactListViewModel(get(), get())
    }
}