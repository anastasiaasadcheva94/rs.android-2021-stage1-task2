package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        val calendar: Calendar = Calendar.getInstance(Locale("RU"))
        calendar.set(year.toInt(), month.toInt() - 1, day.toInt())

        val simpleDateFormat = SimpleDateFormat("dd MMMM, EEEE")
        val final = simpleDateFormat.format(calendar.time)

        return if (final.toString().startsWith(day)) {
            final.toString()
        } else {
            "Такого дня не существует"
        }
    }
}

