import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class ChatResponse(
    @field:Json(name = "id") val id: String,
    @field:Json(name = "object") val gptObject: String,
    @field:Json(name = "created") val created: Int,
    @field:Json(name = "model") val model: String,
    @field:Json(name = "usage") val usage: Usage,
    @field:Json(name = "choices") val choices: List<Choices>
) : Parcelable