class Solution {
    fun checkRecord(s: String): Boolean {
        var absences = 0
        var lateStreak = 0

        for (i in s.indices) {
            if (s[i] == 'A') {
                absences++
                if (absences >= 2) return false
            }

            if (s[i] == 'L') {
                lateStreak++
                if (lateStreak >= 3) return false
            } else {
                lateStreak = 0
            }
        }
        return true
    }
}
