import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Message(
    @field:Json(name = "role") val role: String,
    @field:Json(name = "content") val content: String
) : Parcelable