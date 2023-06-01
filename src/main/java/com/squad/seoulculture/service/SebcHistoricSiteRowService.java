package com.squad.seoulculture.service;

import com.squad.seoulculture.domain.SebcHistoricSiteRow;
import com.squad.seoulculture.repository.SebcHistoricSiteRowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@RequiredArgsConstructor
@Service
public class SebcHistoricSiteRowService {

    private final SebcHistoricSiteRowRepository sebcHistoricSiteRowRepository;

    public String saveHistoricList(SebcHistoricSiteRow sebcHistoricSiteRow) {
        sebcHistoricSiteRowRepository.save(sebcHistoricSiteRow);
        return "Success";
    }
}
