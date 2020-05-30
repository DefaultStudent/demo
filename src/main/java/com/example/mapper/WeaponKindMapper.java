package com.example.mapper;

import com.example.entity.WeaponKind;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public interface WeaponKindMapper {

    ArrayList<WeaponKind> getAll();

    boolean insertOne(WeaponKind weaponKind);
}
