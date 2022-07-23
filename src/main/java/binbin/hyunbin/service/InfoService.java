package binbin.hyunbin.service;

import binbin.hyunbin.mapper.InfoMapper;
import binbin.hyunbin.model.Info;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    InfoMapper infoMapper;

    public InfoService(InfoMapper infoMapper){
        this.infoMapper = infoMapper;
    }

    public Info getName(int id) {
        return infoMapper.getName(id);
    }
}
