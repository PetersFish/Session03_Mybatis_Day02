package cn.peter.mapper;

import cn.peter.pojo.Address;

public interface AddressMapper {
	
	//select by uid
	Address getAddressByUid(Integer id);
}
