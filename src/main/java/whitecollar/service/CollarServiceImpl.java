/*
package whitecollar.service;


import com.crud.h2.dao.IVideoDAO;
import com.crud.h2.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollarServiceImpl implements ICollarService {

	@Autowired
	IVideoDAO iVideoDAO;
	
	@Override
	public List<Video> listarVideos() {
		
		return iVideoDAO.findAll();
	}
	
	@Override
	public Video guardarVideo(Video video) {
		
		return iVideoDAO.save(video);
	}

	@Override
	public Video videoXID(Long id) {
		
		return iVideoDAO.findById(id).get();
	}

	@Override
	public Video actualizarVideo(Video video) {
		
		return iVideoDAO.save(video);
	}

	@Override
	public void eliminarVideo(Long id) {
		
		iVideoDAO.deleteById(id);
		
	}
}
*/