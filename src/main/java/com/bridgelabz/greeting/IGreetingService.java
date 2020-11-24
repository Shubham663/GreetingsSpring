package com.bridgelabz.greeting;

public interface IGreetingService{
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
