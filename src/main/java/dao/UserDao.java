package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import model.User;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import util.MongoDbUtils;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {
    private final MongoCollection<User> collection = MongoDbUtils.getCollection("users", User.class);

    public List<User> findAllUsersWhereCountOfJobsMoreThanThree() {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(Filters.exists("jobs.2"))) {
            users.add(user);
        }
        return users;
    }

    public List<User> findAllUsersWhoWorkedInAmazon() {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(Filters.elemMatch("jobs", Filters.eq("organization", "Amazon")))) {
            users.add(user);
        }
        return users;
    }

    public List<User> findAllJuniorDevelopers() {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(Filters.regex("title", "Junior"))) {
            users.add(user);
        }
        return users;
    }

    public List<User> findUsersByTitleAndAgeLessThanOrEquals(String title, int age) {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(Filters.and(Filters.eq("title", title), Filters.lte("age", age)))) {
            users.add(user);
        }
        return users;
    }

    @Override
    public User get(ObjectId id) {
        return collection.find(Filters.eq(id)).first();
    }

    public List<User> findAllByTitle(String title) {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(Filters.eq("title", title))) {
            users.add(user);
        }
        return users;
    }

    public List<User> findAllByFilter(Bson bson) {
        List<User> users = new ArrayList<>();
        for (User user: collection.find(bson)) {
            users.add(user);
        }
        return users;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (User user : collection.find()) {
            users.add(user);
        }
        return users;
    }

    @Override
    public void delete(ObjectId id) {
        collection.deleteOne(Filters.eq(id));
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            collection.insertOne(user);
        } else {
            collection.replaceOne(Filters.eq(user.getId()), user);
        }
    }
}
