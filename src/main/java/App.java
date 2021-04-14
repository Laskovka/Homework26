import dao.UserDao;
import model.Job;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        /*Task 1*/
        System.out.println(userDao.findUsersByTitleAndAgeLessThanOrEquals("Title", 19));
        /*Task 2*/
        System.out.println(userDao.findAllJuniorDevelopers());
        /*Task 3*/
        System.out.println(userDao.findAllUsersWhoWorkedInAmazon());
        /*Task 4*/
        System.out.println(userDao.findAllUsersWhereCountOfJobsMoreThanThree());

        /*Job job1 = new Job("Amazon", "Title1");
        Job job2 = new Job("Nix Solutions", "Title2");
        Job job3 = new Job("Epam", "Title3");
        Job job4 = new Job("Sigma", "Title4");
        List<Job> list1 = new ArrayList<>();
        list1.add(job1);
        List<Job> list2 = new ArrayList<>();
        list2.add(job1);
        list2.add(job2);
        List<Job> list3 = new ArrayList<>();
        list3.add(job1);
        list3.add(job2);
        list3.add(job3);
        List<Job> list4 = new ArrayList<>();
        list4.add(job1);
        list4.add(job2);
        list4.add(job3);
        list4.add(job4);

        User user1 = new User("AAL", 19, "PHP Junior Developer", list1);
        User user2 = new User("AAL", 20, "Java Junior Developer", list1);
        User user3 = new User("AALf", 19, "JavaScript Junior Developer", list1);
        User user4 = new User("AALfw", 20, "PHP Middle Developer", list2);
        User user5 = new User("AAL", 19, "PHP Senior Developer", list3);
        User user6 = new User("AAL", 30, "Title", list4);
        User user7 = new User("AAL", 35, "Title4", list2);
        User user8 = new User("AAL", 65, "Title", list3);
        User user9 = new User("AAL", 77, "Title5", list4);
        User user10 = new User("AAL41ws", 77, "Title5", list2);
        User user11 = new User("AAL", 44, "Title", list3);
        User user12 = new User("AAL41", 44, "Title", list4);
        User user13 = new User("AAL", 19, "Title5", list2);
        User user14 = new User("AAL", 20, "Title", list3);
        User user15 = new User("AAL", 43, "Title", list4);
        User user16 = new User("AAL", 19, "Title", list1);
        User user17 = new User("AAL", 19, "Title", list1);
        User user18 = new User("AAL", 19, "Title", list2);
        User user19 = new User("AAL", 19, "Title", list3);
        User user20 = new User("AAL", 19, "Title", list4);

        userDao.save(user1);
        userDao.save(user2);
        userDao.save(user3);
        userDao.save(user4);
        userDao.save(user5);
        userDao.save(user6);
        userDao.save(user7);
        userDao.save(user8);
        userDao.save(user9);
        userDao.save(user10);
        userDao.save(user11);
        userDao.save(user12);
        userDao.save(user13);
        userDao.save(user14);
        userDao.save(user15);
        userDao.save(user16);
        userDao.save(user17);
        userDao.save(user18);
        userDao.save(user19);
        userDao.save(user20);*/
    }

    private static User createUser() {
        User user = new User();
        user.setAge(25);
        user.setFullName("Bill White");
        user.setTitle("Senior Java Developer");
        return user;
    }
}
