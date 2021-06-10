package subtask1

import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
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
        val weekDaysNames = arrayOf(
            "понедельник",
            "вторник",
            "среда",
            "четверг",
            "пятница",
            "суббота",
            "воскресенье"
        )

        val c = Calendar.getInstance()
        val date = SimpleDateFormat("dd-MM-yyyy").parse("$day-$month-$year")
        c.time = date
        val monthInt = c[Calendar.MONTH]

        val dayOfWeek = c[Calendar.DAY_OF_WEEK]
        val monthRus = monthNames[monthInt]

        return when (dayOfWeek) {
            in 0..6 -> "$day $monthRus, ${weekDaysNames[dayOfWeek]}"
            else -> "Такого дня не существует"
        }
    }
}