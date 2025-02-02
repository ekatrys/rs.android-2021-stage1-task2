package subtask1

import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val myLocale = Locale("ru", "RU")

        val monthNames = arrayOf(
            "января",
            "февраля",
            "марта",
            "апреля",
            "мая",
            "июня",
            "июля",
            "августа",
            "сентября",
            "октября",
            "ноября",
            "декабря"
        )

        val c = Calendar.getInstance()
        val date = SimpleDateFormat("dd-MM-yyyy").parse("$day-$month-$year")
        c.time = date

        val monthInt = c[Calendar.MONTH]

        val dayOfWeek = try {
            LocalDate.of( year.toInt() , month.toInt() , day.toInt() )
                .dayOfWeek.getDisplayName(TextStyle.FULL, myLocale)
        } catch (e: DateTimeException) {
            null
        }

        val monthRus = monthNames[monthInt]

        return when {
            dayOfWeek != null -> "$day $monthRus, $dayOfWeek"
            else -> "Такого дня не существует"
        }
    }
}