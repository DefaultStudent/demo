package com.example.service;

import com.example.entity.WeaponKind;

import java.util.ArrayList;

public interface WeaponKindService {

    ArrayList<WeaponKind> getAll();

    boolean insertWeaponKind(int weaponKindId, String weaponkindName);
}
