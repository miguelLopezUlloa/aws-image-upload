package com.mikauran.dashboard.employees.datastore;

import com.mikauran.dashboard.employees.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();


    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Mikauran Lopez",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Ian Lopez",null));

    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
