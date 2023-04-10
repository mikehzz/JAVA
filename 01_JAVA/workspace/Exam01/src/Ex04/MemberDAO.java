package Ex04;

import java.util.ArrayList;

import com_pcwk_ehr_cmn.DTO;

public abstract class MemberDAO<MemberDTO> implements WorkDiv<MemberDTO> {

	public ArrayList<MemberDTO> doRetrieve(DTO search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSave(MemberDTO param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doUpdate(MemberDTO param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDelete(MemberDTO param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO doSelectOne(MemberDTO param) {
		// TODO Auto-generated method stub
		return null;
	}

}
