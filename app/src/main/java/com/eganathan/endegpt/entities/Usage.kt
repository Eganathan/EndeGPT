import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Usage(
    @field:Json(name = "prompt_tokens") val promptTokens: Int,
    @field:Json(name = "completion_tokens") val completionTokens: Int,
    @field:Json(name = "total_tokens") val totalTokens: Int
) : Parcelable