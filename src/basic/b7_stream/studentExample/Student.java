package basic.b7_stream.studentExample;

import basic.b7_stream.Course;
import basic.b7_stream.CourseEngagement;

import java.time.LocalDate;
import java.util.*;

public class Student {

    private static long lastStudentId = 1;
    private final static Random random = new Random();

    private final long studentId;
    private final String countryCode;
    private final int yearEnrolled;
    private final int ageEnrolled;
    private final String gender;
    private final boolean programmingExperience;

    private final Map<String, basic.b7_stream.CourseEngagement> engagementMap = new HashMap<>();

    public Student(String countryCode, int yearEnrolled, int ageEnrolled, String gender,
                   boolean programmingExperience, basic.b7_stream.Course... courses) {
        studentId = lastStudentId++;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.ageEnrolled = ageEnrolled;
        this.gender = gender;
        this.programmingExperience = programmingExperience;

        for (basic.b7_stream.Course course : courses) {
            addCourse(course, LocalDate.of(yearEnrolled, 1, 1));
        }
    }

    public void addCourse(basic.b7_stream.Course newCourse) {
        addCourse(newCourse, LocalDate.now());
    }

    public void addCourse(basic.b7_stream.Course newCourse, LocalDate enrollDate) {

        engagementMap.put(newCourse.courseCode(),
                new basic.b7_stream.CourseEngagement(newCourse, enrollDate, "Enrollment"));
    }

    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public boolean hasProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, basic.b7_stream.CourseEngagement> getEngagementMap() {
        return Map.copyOf(engagementMap);
    }

    public int getYearsSinceEnrolled() {
        return LocalDate.now().getYear() - yearEnrolled;
    }

    public int getAge() {
        return ageEnrolled + getYearsSinceEnrolled();
    }

    public int getMonthsSinceActive(String courseCode) {

        CourseEngagement info = engagementMap.get(courseCode);
        return info == null ? 0 : info.getMonthsSinceActive();
    }

    public int getMonthsSinceActive() {

        int inactiveMonths = (LocalDate.now().getYear() - 2014) * 12;
        for (String key : engagementMap.keySet()) {
            inactiveMonths = Math.min(inactiveMonths, getMonthsSinceActive(key));
        }
        return inactiveMonths;
    }

    public double getPercentComplete(String courseCode) {

        var info = engagementMap.get(courseCode);
        return (info == null) ? 0 : info.getPercentComplete();
    }

    public void watchLecture(String courseCode, int lectureNumber, int month, int year) {

        var activity = engagementMap.get(courseCode);
        if (activity != null) {
            activity.watchLecture(lectureNumber, LocalDate.of(year, month, 1));
        }
    }

    private static String getRandomVal(String... data) {
        return data[random.nextInt(data.length)];
    }

    private static basic.b7_stream.Course[] getRandomSelection(basic.b7_stream.Course... courses) {

        int courseCount = random.nextInt(1, courses.length + 1);
        List<basic.b7_stream.Course> courseList = new ArrayList<>(Arrays.asList(courses));
        Collections.shuffle(courseList);
        List<basic.b7_stream.Course> selectedCourses = courseList.subList(0, courseCount);
        return selectedCourses.toArray(new basic.b7_stream.Course[0]);
    }

    public static basic.b7_stream.Student getRandomStudent(basic.b7_stream.Course... courses) {

        int maxYear = LocalDate.now().getYear() + 1;
        basic.b7_stream.Course[] randomCourses = getRandomSelection(courses);

        basic.b7_stream.Student student = new basic.b7_stream.Student(
                getRandomVal("AU", "CA", "CN", "GB", "IN", "UA", "US"),
                random.nextInt(2015, maxYear),
                random.nextInt(18, 90),
                getRandomVal("M", "F", "U"),
                random.nextBoolean(),
                randomCourses);

        for (Course c : randomCourses) {
            int lecture = random.nextInt(30, c.lectureCount());
            int year = random.nextInt(student.getYearEnrolled(), maxYear);
            int month = random.nextInt(1, 13);
            if (year == (maxYear - 1)) {
                if (month > LocalDate.now().getMonthValue()) {
                    month = LocalDate.now().getMonthValue();
                }
            }
            student.watchLecture(c.courseCode(), lecture, month, year);
        }
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", countryCode='" + countryCode + '\'' +
                ", yearEnrolled=" + yearEnrolled +
                ", ageEnrolled=" + ageEnrolled +
                ", gender='" + gender + '\'' +
                ", programmingExperience=" + programmingExperience +
                ", engagementMap=" + engagementMap +
                '}';
    }
}
