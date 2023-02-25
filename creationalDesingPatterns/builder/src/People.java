public class People {
    private String name;
    private String surname;
    private String patronymic;
    private String passportSeries;
    private String passportNumber;
    private Integer age;
    private Boolean isMarried;
    private Integer salary;
    private String citizenship;
    private Integer childrenCount;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public Integer getChildrenCount() {
        return childrenCount;
    }

    public static class Builder {
        private final People people;

        public Builder(){
            people = new People();
        }

        public Builder name(String name) {
            people.name = name;
            return this;
        }

        public Builder surname(String surname) {
            people.surname = surname;
            return this;
        }

        public Builder patronymic(String patronymic) {
            people.patronymic = patronymic;
            return this;
        }

        public Builder passportSeries(String passportSeries) {
            people.passportSeries = passportSeries;
            return this;
        }

        public Builder passportNumber(String passportNumber) {
            people.passportNumber = passportNumber;
            return this;
        }

        public Builder age(Integer age) {
            people.age = age;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            people.isMarried = isMarried;
            return this;
        }

        public Builder salary(Integer salary) {
            people.salary = salary;
            return this;
        }

        public Builder citizenship(String citizenship) {
            people.citizenship = citizenship;
            return this;
        }

        public Builder childrenCount(Integer childrenCount) {
            people.childrenCount = childrenCount;
            return this;
        }

        public People build() {
            return people;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        appendIfNotNull(sb, name);
        appendIfNotNull(sb, patronymic);
        appendIfNotNull(sb, surname);
        appendIfNotNull(sb, passportSeries);
        appendIfNotNull(sb, passportNumber);
        appendIfNotNull(sb, age);
        appendIfNotNull(sb, isMarried);
        appendIfNotNull(sb, salary);
        appendIfNotNull(sb, citizenship);
        appendIfNotNull(sb, childrenCount);

        return sb.toString();
    }

    private void appendIfNotNull(StringBuilder sb, Object o) {
        if (o != null) {
            sb.append(o).append(" ");
        }
    }
}
