package zh.codegym.task.task11.task1105;

/* IT 公司
编写以下九个类：Employee、Clerk、ITSpecialist、Programmer、ProjectManager、CTO、Recruiter、OfficeManager 和 Custodian。
让 Programmer、ProjectManager、CTO 类继承 ITSpecialist 类。
让 Recruiter、Custodian 和 OfficeManager 类继承 Clerk 类。
让 Clerk 和 ITSpecialist 类继承 Employee 类。
Requirements:
1. Solution 类必须包含 public Employee 类。
2. Solution 类必须包含 public Clerk 类。
3. Solution 类必须包含 public ITSpecialist 类。
4. Solution 类必须包含 public Programmer 类。
5. Solution 类必须包含 public ProjectManager 类。
6. Solution 类必须包含 public CTO 类。
7. Solution 类必须包含 public Recruiter 类。
8. Solution 类必须包含 public OfficeManager 类。
9. Solution 类必须包含 public Custodian 类。
10. Programmer、ProjectManager 和 CTO 类必须继承 ITSpecialist 类。
11. Recruiter、Custodian 和 OfficeManager 类必须继承 Clerk 类。
12. Clerk 和 ITSpecialist 类必须继承 Employee 类。
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Employee {

    }

    public class Clerk extends Employee{

    }

    public class ITSpecialist extends Employee{

    }

    public class Programmer extends ITSpecialist{

    }

    public class ProjectManager extends ITSpecialist{

    }

    public class CTO extends ITSpecialist{

    }

    public class OfficeManager extends Clerk{

    }

    public class Recruiter extends Clerk{

    }

    public class Custodian extends Clerk{

    }
}
