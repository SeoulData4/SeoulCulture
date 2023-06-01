package com.squad.seoulculture.service;


import com.squad.seoulculture.model.entity.Profile;
import com.squad.seoulculture.model.network.Header;
import com.squad.seoulculture.model.network.request.ProfileRequest;
import com.squad.seoulculture.model.network.response.ProfileResponse;
import com.squad.seoulculture.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileLogicService extends BaseService<ProfileRequest, ProfileResponse, Profile> {
    private final ProfileRepository profileRepository;
    private ProfileResponse response(Profile profile) {
        ProfileResponse profileApiResponse = ProfileResponse.builder()
                .prIdx(profile.getPrIdx())
                .prName(profile.getPrName())
                .prRegion(profile.getPrRegion())
                .prHp(profile.getPrHp())
                .regDate(profile.getRegDate())
                .updateDate(profile.getUpdateDate())
                .build();
        return profileApiResponse;
    }

//    public Header<ProfileResponse> updateMemo(Header<ProfileRequest> request) {
//        ProfileRequest profileRequest = request.getData();
//        System.out.println(profileRequest.getPrIdx());
//        Optional<Profile> users = baseRepository.findById(profileRequest.getPrIdx());
//
//        return users.map(
//                        user -> {
//                            user.setPrMemo(profileRequest.getPrMemo());
//                            return user;
//                        }).map(user -> baseRepository.save(user))
//                .map(user -> response(user))
//                .map(Header::OK)
//                .orElseGet(() -> Header.ERROR("데이터 없음")
//                );
//    }



//    public Header<ProfileResponse> updatePoint(Long prIdx, Integer point){
//        Optional<Profile> profile = profileRepository.findByPrIdx(prIdx);
//        return profile.map(                        user->{
//                    user.setPrPoint(user.getPrPoint()+point);
//                    return user;
//                }).map(user-> baseRepository.save(user))
//                .map(user->response(user))
//                .map(Header::OK)
//                .orElseGet(()->Header.ERROR("데이터 없음"));
//    }

    @Override
    public Header<ProfileResponse> create(Header<ProfileRequest> request) {
        return null;
    }

    @Override
    public Header<ProfileResponse> read(Long id) {
        return null;
    }

//    @Override
//    public Header<ProfileResponse> read(Long id) {
//        return null;
//    }

//    @Override
//    public Header<ProfileResponse> read(Long id) {
//        return null;
//    }

//    @Override
//    public Header<ProfileResponse> read(Long id) {
//        return profileRepository.findById(id).map(profile -> response(profile))
//                .map(Header ::OK).orElseGet(()->Header.ERROR("데이터없음"));
//    }

    // 로그인
    public Header<ProfileResponse> read(String prId, String prUserpw) {
        return profileRepository.findByPrIdAndPrUserpw(prId, prUserpw).map(
                        users -> response(users)).map(Header::OK)
                .orElseGet(() -> Header.ERROR("아이디또는 비번이 틀림")
                );
    }

    public Header <List<ProfileResponse>> search(Pageable pageable) {
        Page<Profile> profiles = baseRepository.findAll(pageable);
        List<ProfileResponse> profileApiResponse = profiles.stream().map(
                profile -> response(profile)).collect(Collectors.toList());

        return Header.OK(profileApiResponse);
    }

    @Transactional(readOnly = true)
    public Page<Profile> list(Pageable pageable) {
        return profileRepository.findAll(pageable);
    }

    @Override
    public Header<ProfileResponse> update(Header<ProfileRequest> request) {
        return null;
    }

    @Override
    public Header<ProfileResponse> delete(Long id) {
        return null;
    }


}
