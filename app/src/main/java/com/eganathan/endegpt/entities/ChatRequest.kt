import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Json4Kotlin_Base(
    @field:Json(name = "model") val model: String,
    @field:Json(name = "messages") val messages: List<Message>,
    @field:Json(name = "temperature") val temperature: Double
) : Parcelable