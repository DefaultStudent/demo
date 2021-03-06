package com.example.service.Impl;

import com.example.entity.WeaponKind;
import com.example.mapper.WeaponKindMapper;
import com.example.service.WeaponKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value="weaponKindService")
public class WeaponKindServiceImpl implements WeaponKindService {

    @Resource
    private WeaponKindMapper weaponKindMapper;

    @Override
    public ArrayList<WeaponKind> getAll() {
        return weaponKindMapper.getAll();
    }

    @Override
    public boolean insertWeaponKind(int weaponKindId, String weaponkindName) {

        WeaponKind weaponKind = new WeaponKind();

        weaponKind.setWeaponKindId(weaponKindId);
        weaponKind.setWeaponKindName(weaponkindName);

        if (weaponKindMapper.insertOne(weaponKind)){
            return true;
        } else {
          return false;
        }
    }
}
