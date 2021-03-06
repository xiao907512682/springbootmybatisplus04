package com.zt.service;

import com.zt.entity.Car;
import com.zt.entity.Transaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author guan
 * @create 2020-05-08 14:14
 */
public interface CarService {
    /**
     * 首页查询前九辆
     * @return
     */
    public List<Car> selectlimit();

    /**首页根据车龄查询
     *
     */
    public List<Car> selectCarage();

    /**首页根据降价大于十万查询
     *
     */
    public List<Car> selectOprice();

    /**
     * 卖车
     */
    public int insertCar(Car car);

    /**
     * 评估状态修改
     */
    public int updateCarassesstate(Car car);

    /**
     * 上架状态修改
     */
    public int updateCarputstate(Car car);

    /**
     * 查询评估完成的车辆或者未完成的车辆
     */
    public List<Car> selectgetAssesstate(Car car);

    /**
     * 查询已评估未上架的车辆或已上架的车辆
     */
    public List<Car> selectgetPutstate(Car car);

    /**
     * 多条件查询车辆
     */
    public List<Car> manyConditions(Car car);

    /**
     * 多条件查询且分页
     */
    /**
     * 多条件查询车辆且分页
     *
     */
    public List<Car> manyCar(Car car,@Param("first") int first, @Param("pageSize") int pageSize);

    /**
     * 模糊查询
     * @param search
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public List<Car> searchCarByPage(@Param("search") String search,@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);

    public Car searchCarPageCount(String search);

    /**
     * 查询一辆车的六张图片
     * 后续跳进查询一辆车的详细信息方法
     */
    public Car getCarone(Car car);

    /**
     * 查询一辆车的详细信息
     */
    public Car getCarinfo(Car car);
    /**
     * 查询一辆车的详细信息max
     */
    public Car getCardinfomax(Car car);

    public List<Car> adminGetCarByPage(int pageIndex,int pageSize);
    public List<Car> adminGetPageCount();

    public Car GetOneCarAllInfo(int cid);
    public int adminUpdCar(Car car);
    /**
     * 查询对应用户所买的车
     *
     */
    public List<Car> selectTranction(Transaction transaction);

    /**
     *  查询对应用户所卖的车
     */
    public List<Car> selectTranctionseller(Transaction transaction);
    public List<Car> jiangPageconut(Car car);

    /*
     * 添加车辆信息
     * */
    public String carall(int bid, int csid, int corolid, int uid, Double oprice, Double price, int addressid, int carage, String img);
    public String carimg(int cid,String src);
    public Car carcid();

    /*
     * 查询bid对应的csname
     * */
    public Car getcs(Car bid);
}
