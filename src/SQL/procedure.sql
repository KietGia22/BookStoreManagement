set serveroutput on;
-------------------------INSERT, UPDATE, DELETE--------------------------------------------
--TAIKHOAN
CREATE OR REPLACE PROCEDURE ThemTK(dn TAIKHOAN.TENDN%TYPE, mk TAIKHOAN.MATKHAU%TYPE, hten TAIKHOAN.HOTEN%TYPE, ngsinh TAIKHOAN.NGAYSINH%TYPE,  dc TAIKHOAN.DIACHI%TYPE, sdt TAIKHOAN.SDT%TYPE, gmail TAIKHOAN.GMAIL%TYPE, cv TAIKHOAN.CHUCVU%TYPE, ngtao TAIKHOAN.NGAYTAOTAIKHOAN%TYPE, luong TAIKHOAN.LUONG%TYPE)
AS
BEGIN 
        INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) VALUES (SQ_TK.NEXTVAL, dn, mk, hten, ngsinh, dc, sdt, gmail, ngtao, cv, luong);
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE SuaTK(mtk TAIKHOAN.MATK%TYPE, hten TAIKHOAN.HOTEN%TYPE, ngsinh TAIKHOAN.NGAYSINH%TYPE,  dc TAIKHOAN.DIACHI%TYPE, sdt TAIKHOAN.SDT%TYPE, gmail TAIKHOAN.GMAIL%TYPE, cv TAIKHOAN.CHUCVU%TYPE, luong TAIKHOAN.LUONG%TYPE)
AS
BEGIN 
       UPDATE TAIKHOAN
       SET HOTEN = hten,
       NGAYSINH = ngsinh,
       DIACHI = dc,
       SDT = sdt,
       GMAIL = gmail,
       CHUCVU = cv,
       LUONG = luong
       WHERE MATK = mtk;
       COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE XoaTK(mtk TAIKHOAN.MATK%TYPE)
AS
BEGIN 
       DELETE FROM TAIKHOAN WHERE MATK = mtk;
       COMMIT;
END;
/

--KHACHHANG
CREATE OR REPLACE PROCEDURE ThemKH(hten KHACHHANG.HOTEN%TYPE, ngsinh KHACHHANG.NGAYSINH%TYPE,  dc KHACHHANG.DIACHI%TYPE, sdt KHACHHANG.SDT%TYPE, gtinh KHACHHANG.GIOITINH%TYPE, gc KHACHHANG.GHICHU%TYPE, cccd KHACHHANG.CCCD%TYPE)
AS
BEGIN 
        INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH, GHICHU) VALUES (SQ_KH.NEXTVAL, hten, ngsinh, sdt, dc, cccd , gtinh, gc);
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE SuaKH(mkh KHACHHANG.MAKH%TYPE, hten KHACHHANG.HOTEN%TYPE, ngsinh KHACHHANG.NGAYSINH%TYPE,  dc KHACHHANG.DIACHI%TYPE, sdt KHACHHANG.SDT%TYPE, gtinh KHACHHANG.GIOITINH%TYPE, gc KHACHHANG.GHICHU%TYPE, cccd KHACHHANG.CCCD%TYPE)
AS
BEGIN 
       UPDATE KHACHHANG
       SET HOTEN = hten,
       NGAYSINH = ngsinh,
       DIACHI = dc,
       SDT = sdt,
       CCCD = cccd,
       GIOITINH = gtinh,
       GHICHU = gc
       WHERE MAKH = mkh;
       COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE XoaKH(mkh KHACHHANG.MAKH%TYPE)
AS
BEGIN 
        DELETE FROM KHACHHANG WHERE MAKH = mkh;
        COMMIT;
END;
/

--SACH
CREATE OR REPLACE PROCEDURE ThemSACH(ts SACH.TENSACH%TYPE, gia SACH.GIA%TYPE, mtl SACH.MATL%TYPE, sl SACH.SLTON%TYPE, anh SACH.ANHSACH%TYPE, gc SACH.GHICHU%TYPE, tg SACH.TENTG%TYPE, nxb SACH.NXB%TYPE)
AS
BEGIN 
        INSERT INTO SACH(MASACH, TENSACH, GIA, MATL, SLTON, TENTG, NXB, ANHSACH, GHICHU) VALUES (SQ_S.NEXTVAL, ts, gia, mtl, sl, tg, nxb, anh, gc);
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE SuaSACH(ms SACH.MASACH%TYPE, ts SACH.TENSACH%TYPE, gia SACH.GIA%TYPE, mtl SACH.MATL%TYPE, sl SACH.SLTON%TYPE, anh SACH.ANHSACH%TYPE, gc SACH.GHICHU%TYPE, tg SACH.TENTG%TYPE, nxb SACH.NXB%TYPE)
AS
BEGIN 
        UPDATE SACH
        SET TENSACH = ts,
        GIA = gia,
        MATL = mtl,
        SLTON = sl,
        ANHSACH = anh,
        GHICHU = gc,
        TENTG = tg,
        NXB = nxb
        WHERE MASACH = ms;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE XoaSACH(ms SACH.MASACH%TYPE)
AS
BEGIN 
        DELETE FROM SACH WHERE MASACH = ms;
        COMMIT;
END;
/

--HOADON
CREATE OR REPLACE PROCEDURE ThemHD(mkh HOADON.MAKH%TYPE, mtk HOADON.MATK%TYPE)
AS 
BEGIN
       INSERT INTO HOADON(MAHD, MAKH, MATK) VALUES (SQ_HD.NEXTVAL, mkh, mtk);
       COMMIT;
END;
/

---PHIEUNHAP
CREATE OR REPLACE PROCEDURE ThemPN(ncc PHIEUNHAP.MANCC%TYPE, mtk PHIEUNHAP.MATK%TYPE)
AS 
BEGIN
       INSERT INTO PHIEUNHAP(MAPN, MANCC, MATK) VALUES (SQ_PN.NEXTVAL, ncc, mtk);
       COMMIT;
END;
/

--NHACUNGCAP
CREATE OR REPLACE PROCEDURE ThemNCC(tenncc NHACUNGCAP.TENNCC%TYPE, dc NHACUNGCAP.DIACHI%TYPE, sdt NHACUNGCAP.SDT%TYPE)
AS
BEGIN 
        INSERT INTO NHACUNGCAP(MANCC, TENNCC, DIACHI, SDT) VALUES (SQ_NCC.NEXTVAL, tenncc, dc, sdt);
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE SuaNCC(ma NHACUNGCAP.MANCC%TYPE, tenncc NHACUNGCAP.TENNCC%TYPE, dc NHACUNGCAP.DIACHI%TYPE, sdt NHACUNGCAP.SDT%TYPE)
AS
BEGIN 
        UPDATE NHACUNGCAP
        SET TENNCC = tenncc,
        DIACHI = dc,
        SDT = sdt
        WHERE MANCC = ma;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE XoaNCC(ma NHACUNGCAP.MANCC%TYPE)
AS
BEGIN 
        DELETE FROM NHACUNGCAP
        WHERE MANCC = ma;
        COMMIT;
END;
/
--THELOAI
CREATE OR REPLACE PROCEDURE ThemTL(tentl THELOAI.TENTHELOAI%TYPE, gc THELOAI.GHICHU%TYPE)
AS
BEGIN 
        INSERT INTO THELOAI(MATL, TENTHELOAI, GHICHU) VALUES (SQ_TL.NEXTVAL, tentl, gc);
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE SuaTL(mtl THELOAI.MATL%TYPE, tentl THELOAI.TENTHELOAI%TYPE, gc THELOAI.GHICHU%TYPE)
AS
BEGIN 
        UPDATE THELOAI
        SET TENTHELOAI = tentl,
        GHICHU = gc
        WHERE MATL = mtl;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE XoaTL(mtl THELOAI.MATL%TYPE)
AS
BEGIN 
        DELETE FROM THELOAI WHERE MATL = mtl;
        COMMIT;
END;
/

---CHI TIET HOA DON
CREATE OR REPLACE PROCEDURE ThemCTHD(mhd CTHD.MAHD%TYPE, ms CTHD.MASACH%TYPE, sl CTHD.SOLUONG%TYPE)
AS
BEGIN 
       INSERT INTO CTHD(MAHD, MASACH, SOLUONG) VALUES (mhd, ms, sl);
       COMMIT;
END;
/

--CHI TIET PHIEU NHAP
CREATE OR REPLACE PROCEDURE ThemCTPN(mpn CTPN.MAPN%TYPE, ms CTPN.MASACH%TYPE, sl CTPN.SOLUONGNHAP%TYPE, gia CTPN.GIANHAP%TYPE)
AS
BEGIN 
       INSERT INTO CTPN(MAPN, MASACH, SOLUONGNHAP, GIANHAP) VALUES (mpn, ms, sl, gia);
       COMMIT;
END;
/

--CHAM CONG
CREATE OR REPLACE PROCEDURE ThemCCONG(mtk CHAMCONG.MATK%TYPE)
AS
BEGIN
       INSERT INTO CHAMCONG(MATK) VALUES (mtk);
       COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE SUAKETTHUCCCong(mtk CHAMCONG.MATK%TYPE)
AS
    kt CHAMCONG.KETTHUC%TYPE;
BEGIN
    SELECT SYSDATE INTO kt FROM DUAL;
    
    UPDATE CHAMCONG
    SET KETTHUC = kt
    WHERE MATK = mtk
    AND TO_DATE(TO_CHAR(kt, 'DD-MM-YYYY'), 'DD-MM-YYYY') = TO_DATE(TO_CHAR(BATDAULAM, 'DD-MM-YYYY'), 'DD-MM-YYYY');
    COMMIT;
END;
/
---LUONG
CREATE OR REPLACE PROCEDURE ThemLUONGNV(month_out LUONG.THANG%TYPE, year_out LUONG.NAM%TYPE, mtk LUONG.MATK%TYPE)
AS
BEGIN
       INSERT INTO LUONG(THANG, NAM, MATK) VALUES (month_out, year_out, mtk);
       COMMIT;
END;




-----------------GET DU LIEU ------------------------
--TAIKHOAN
CREATE OR REPLACE PROCEDURE GETTCTK(out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM TAIKHOAN
        ORDER BY HOTEN;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETTKTHEOMA(mtk TAIKHOAN.MATK%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM TAIKHOAN
        WHERE MATK = mtk
        ORDER BY HOTEN;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETTKTHEOTEN(hten TAIKHOAN.HOTEN%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM TAIKHOAN
        WHERE HOTEN =  hten
        ORDER BY HOTEN;
        COMMIT;
END;
/

--KHACH HANG
CREATE OR REPLACE PROCEDURE GETTCKH(out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM KHACHHANG
        ORDER BY HOTEN;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETKHTHEOMA(mkh  KHACHHANG.MAKH%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM KHACHHANG
        WHERE MAKH = mkh
        ORDER BY HOTEN;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETKHTHEOTEN(hten  KHACHHANG.HOTEN%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM KHACHHANG
        WHERE HOTEN =  hten
        ORDER BY HOTEN;
        COMMIT;
END;
/

----SACH
CREATE OR REPLACE PROCEDURE GETTCSACH(out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM SACH
        ORDER BY TENSACH;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETSACHTHEOMA(ms SACH.MASACH%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM SACH, THELOAI
        WHERE MASACH = ms
         AND SACH.MATL = THELOAI.MATL
        ORDER BY TENSACH;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETSACHTHEOTEN(ts  SACH.TENSACH %TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
        OPEN out_cur FOR
        SELECT * FROM SACH, THELOAI
        WHERE TENSACH =  ts
        AND SACH.MATL = THELOAI.MATL
        ORDER BY TENSACH;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETSACHTHEOHD (mhd CTHD.MAHD%TYPE,  out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
     OPEN out_cur FOR
     SELECT * FROM SACH S, CTHD CT
     WHERE S.MASACH = CT.MASACH
     AND CT.MAHD = mhd
     ORDER BY S.TENSACH;
     COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETSACHTHEOPN (mpn CTPN.MAPN%TYPE,  out_cur OUT SYS_REFCURSOR)
AS
BEGIN 
     OPEN out_cur FOR
     SELECT * FROM SACH S, CTPN CT
     WHERE S.MASACH = CT.MASACH
     AND CT.MAPN = mpn
     ORDER BY S.TENSACH;
     COMMIT;
END;

---THELOAI
CREATE OR REPLACE PROCEDURE GETTCTL(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM THELOAI
        ORDER BY TENTHELOAI;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETTLTHEOMA(mtl THELOAI.MATL%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM THELOAI
        WHERE MATL = mtl
        ORDER BY TENTHELOAI;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETTLTHEOTEN(ttl THELOAI.TENTHELOAI%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM THELOAI
        WHERE TENTHELOAI = ttl
        ORDER BY TENTHELOAI;
        COMMIT;
END;
/

---NHACUNGCAP
CREATE OR REPLACE PROCEDURE GETTCNCC(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM NHACUNGCAP
        ORDER BY TENNCC;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETNCCTHEOMA(mncc NHACUNGCAP.MANCC%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM NHACUNGCAP
        WHERE MANCC = mncc
        ORDER BY TENNCC;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETNCCTHEOTEN(tncc NHACUNGCAP.TENNCC%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM NHACUNGCAP
        WHERE TENNCC = tncc
        ORDER BY TENNCC;
        COMMIT;
END;
/

--HOADON
CREATE OR REPLACE PROCEDURE GETTCHD(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM HOADON
        WHERE TONGTIEN > 0;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETHDTHEOMA(mhd HOADON.MAHD%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM HOADON
        WHERE TONGTIEN > 0
        AND MAHD = mhd;
        COMMIT;
END; 
/
CREATE OR REPLACE PROCEDURE GETTHANGHD(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT DISTINCT(EXTRACT(MONTH FROM NGAYTAOHD)) FROM HOADON;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETNAMHD(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT DISTINCT(EXTRACT(YEAR FROM NGAYTAOHD)) FROM HOADON;
        COMMIT;
END;
/

--PHIEUNHAP
CREATE OR REPLACE PROCEDURE GETTCPN(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM PHIEUNHAP
        WHERE TONGTIENNHAP > 0;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETPNTHEOMA(mpn PHIEUNHAP.MAPN%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM PHIEUNHAP
        WHERE TONGTIENNHAP > 0
        AND MAPN = mpn;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETPNTHEONV(mtk PHIEUNHAP.MATK%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM PHIEUNHAP
        WHERE TONGTIENNHAP > 0
        AND MATK = mtk;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETTHANGPN(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT DISTINCT(EXTRACT(MONTH FROM NGAYNHAP)) FROM PHIEUNHAP;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETNAMPN(out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT DISTINCT(EXTRACT(YEAR FROM NGAYNHAP)) FROM PHIEUNHAP;
        COMMIT;
END;
/

---LUONG
CREATE OR REPLACE PROCEDURE GETTCLUONG( out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM LUONG;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETLUONGTHEONV(mtk LUONG.MATK%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM LUONG
        WHERE MATK = mtk;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETLUONGTHEOTHANG(month_out LUONG.THANG%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM LUONG
        WHERE THANG = month_out;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GETLUONGTHEONAM(year_out LUONG.NAM%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM LUONG
        WHERE NAM = year_out;
        COMMIT;
END;
/

--CHAMCONG
CREATE OR REPLACE PROCEDURE GETCHAMCONG( out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM CHAMCONG;
        COMMIT;
END;
/
--CHI TIET PHIEU NHAP
CREATE OR REPLACE PROCEDURE GETCTPNTHEOMA(mpn CTPN.MAPN%TYPE, out_cur OUT SYS_REFCURSOR)
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM CTPN
        WHERE SOLUONGNHAP > 0
        AND MAPN = mpn;
        COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE GET_DANG_NHAP(tendn TAIKHOAN.TENDN%TYPE, mk TAIKHOAN.MATKHAU%TYPE, out_cur OUT SYS_REFCURSOR) 
AS
BEGIN
       OPEN out_cur FOR 
        SELECT * FROM TAIKHOAN
        WHERE TENDN = tendn
        AND MATKHAU = mk;
        COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_TL_CHO_SACH(out_cur OUT SYS_REFCURSOR)
AS 
BEGIN 
      OPEN out_cur FOR
      SELECT * FROM SACH S, THELOAI TL
      WHERE S.MATL = TL.MATL;
      COMMIT;
END;

   













