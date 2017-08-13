package cc;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * �ļ�����������
 * 
 * @author mickkong
 *
 */
public class FileUtil {

	/**
	 * �ƶ��ļ������ļ���
	 * 
	 * @param oldPath
	 *            Դ·��
	 * @param newPath
	 *            ��·��
	 * @throws IOException
	 */
	public static void moveTo(String oldPath, String newPath) throws IOException {
		copyFile(oldPath, newPath);
		deleteFile(oldPath);
	}

	/**
	 * ɾ���ļ������ļ���
	 * 
	 * @param filePath
	 *            �ļ�·��
	 */
	public static void deleteFile(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			return;
		}
		if (file.isDirectory()) {
			File[] list = file.listFiles();

			for (File f : list) {
				deleteFile(f.getAbsolutePath());
			}
		}
		file.delete();
	}

	/**
	 * ���� �ļ������ļ���
	 * 
	 * @param oldPath
	 *            Դ·��
	 * @param newPath
	 *            ��·��
	 * @throws IOException
	 */
	public static void copyFile(String oldPath, String newPath) throws IOException {
		System.out.println("copy file from [" + oldPath + "] to [" + newPath + "]");

		File oldFile = new File(oldPath);
		if (oldFile.exists()) {

			if (oldFile.isDirectory()) { // ������ļ���
				File newPathDir = new File(newPath);
				newPathDir.mkdirs();
				File[] lists = oldFile.listFiles();
				if (lists != null && lists.length > 0) {
					for (File file : lists) {
						copyFile(file.getAbsolutePath(), newPath.endsWith(File.separator) ? newPath + file.getName()
								: newPath + File.separator + file.getName());
					}
				}
			} else {
				InputStream inStream = new FileInputStream(oldFile); // ����ԭ�ļ�
				FileOutputStream fs = new FileOutputStream(newPath);
				write2Out(inStream, fs);
				inStream.close();
			}
		}
	}

	/**
	 * �������ļ�
	 * 
	 * @param file
	 *            �ļ�
	 * @param name
	 *            ���ļ���
	 * @return
	 */
	public static File renameFile(File file, String name) {
		String fileName = file.getParent() + File.separator + name;
		File dest = new File(fileName);
		file.renameTo(dest);
		return dest;
	}

	/**
	 * ѹ������ļ�
	 * 
	 * @param zipFileName
	 *            ѹ������ļ���
	 * @param files
	 *            ��Ҫѹ�����ļ�
	 * @return
	 * @throws Exception
	 */
	public static File createZip(String zipFileName, File... files) throws Exception {
		File outFile = new File(zipFileName);
		ZipOutputStream out = null;
		BufferedOutputStream bo = null;
		try {
			out = new ZipOutputStream(new FileOutputStream(outFile));
			bo = new BufferedOutputStream(out);

			for (File file : files) {
				zip(out, file, file.getName(), bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bo.close();
			} finally {
				out.close();
			}
		}
		return outFile;
	}

	/**
	 * ѹ�������ļ�
	 * 
	 * @param zipFileName
	 *            ѹ������ļ���
	 * @param inputFile
	 *            ��Ҫѹ�����ļ�
	 * @return
	 * @throws Exception
	 */
	public static File createZip(String zipFileName, File inputFile) throws Exception {
		File outFile = new File(zipFileName);
		ZipOutputStream out = null;
		BufferedOutputStream bo = null;
		try {
			out = new ZipOutputStream(new FileOutputStream(outFile));
			bo = new BufferedOutputStream(out);
			zip(out, inputFile, inputFile.getName(), bo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bo.close();
			} finally {
				out.close();
			}
		}
		return outFile;
	}

	private static void zip(ZipOutputStream out, File f, String base, BufferedOutputStream bo) throws Exception { // ��������
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			if (fl == null || fl.length == 0) {
				out.putNextEntry(new ZipEntry(base + "/")); // ��������һ���յ��ļ���
			} else {
				for (int i = 0; i < fl.length; i++) {
					zip(out, fl[i], base + "/" + fl[i].getName(), bo); // �ݹ�������ļ���
				}
			}

		} else {
			out.putNextEntry(new ZipEntry(base)); // ����zipѹ������ base �ļ�
			System.out.println(base);
			BufferedInputStream bi = new BufferedInputStream(new FileInputStream(f));

			try {
				write2Out(bi, out);
			} catch (IOException e) {
			} finally {
				bi.close();
			}
		}
	}

	private static void write2Out(InputStream input, OutputStream out) throws IOException {
		byte[] b = new byte[1024];
		int c = 0;
		while ((c = input.read(b)) != -1) {
			out.write(b, 0, c);
			out.flush();
		}
		out.flush();
	}
}
