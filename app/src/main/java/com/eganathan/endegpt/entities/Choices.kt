import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Choices(
    @field:Json(name = "message") val message: Message,
    @field:Json(name = "finish_reason") val finishReason: String,
    @field:Json(name = "index") val index: Int
) : Parcelable