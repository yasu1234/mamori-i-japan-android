package jp.mamori_i.app.screen.register

import jp.mamori_i.app.data.model.PrefectureType
import jp.mamori_i.app.data.model.Profile
import java.io.Serializable

data class AuthSmsTransitionEntity(val verificationId: String, val profile: Profile): Serializable