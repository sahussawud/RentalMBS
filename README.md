

# RentalMBS

Small Rental Scooter Management - With Object-Oriented Programming(JAVA)

## Abstraction

 โปรเเกรมนี้เป็นโปรเเกรมที่ใช้ช่วยบริหารจัดการธุรกิจรถจักยานยนต์ให้เช่า
 #### การบริหารคลังของรถจักยานยนต์(Motorbike Inventory)
 ที่สามารถตวรจสอบ เพิ่ม ลด เเก้ไข้ได้ 
 #### การบันทึกรายการประจำวัน(Daily Transactions) 
 จัดการในการเก็บข้อมูลลูกค้า รายละเอียดการเช่า เอกสารสัญญา  สิ่งที่เป็นรายจ่ายของธุรกิจ 
 #### มีส่วนที่สามารถดูผลสรุปยอดขาย(Dashboard) 
 เพื่อดูรายรับรายจ่ายรวมในเเต่ละรอบเดือนของธุรกิจ เเละ สามารถตรวจสอบรถที่กำลังถูกเช่าอยู่ได้ด้วย

### objective
- สะดวกต่อธุรกิจขนาดย่อม
- ลดต้นทุน
- เพื่อนำทักษะการโปรแกรมเชิงวัตถุช่วยในการออกแบบ
- การนำไปใช้ได้จริง


### Class Diagram


![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/classdiagram.png "Class Diagram")

## User Interface


![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Dashboard1.png "Dashboard Interface(1)")


![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Dashboard2.png "Dashboard Interface(2)")

<dl>
  <dt>Dashboard</dt>
  <dd>จะเป็นส่วนของหน้า Dashboard จะเป็นหน้าที่แสดงสถานะรถ ว่างกี่คัน ไม่ว่างกี่คัน ส่งซ่อมกี่คัน มีตารางบอกวันและเวลา ตารางแสดงรายละเอียดของรถ ธุรกรรมการทำรายการล่าสุด และรายการรถที่ถูกส่งซ่อมมีจำนวนกี่คัน คันไหนบ้าง สามารถกดดูผ่านหน้า Dashboard มีกราฟสถิติแสดงรายรับ-รายจ่ายของแต่ละเดือน สามารถเลือกดูรายเดือนได้ตามการกดเลือก  และมีส่วนของรายรับที่จะแสดงสัดส่วนเพื่อให้เห็นรายจ่ายของธุรกิจ รายได้กำไรขาดทุน 
</dd>
</dl>

![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Expense.png "Expense Interface")

<dl>
  <dt>Expense</dt>
  <dd>หน้า Expense จะแสดงรายการค่าใช้จ่ายที่สามารถลงทะเบียนผ่าน expense สามารถแก้ไขได้ และลบรายการได้อย่างง่ายดายผ่านการคลิก และ ลบได้ทันที และจะทำการเก็บข้อมูลเพื่อนำไปประมาณผลเป็นรายงานนำเสนอต่อ 
</dd>
</dl>

![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Register.png "Register Interface")

<dl>
  <dt>Register</dt>
  <dd> จะเป็นระบบการลงทะเบียนข้อมูลของรถในสต็อก (Register) หรือจะลบข้อมูลรถที่ไม่ได้ถูกใช้งานแล้ว มีการเก็บยี่ห้อรถ รุ่น สี ทะเบียน ราคาเช่า/เดือน ราคาเช่า/วัน วันที่ถูกนำเข้ามา และสถานะของรถ มีฟังก์ชันเพิ่ม ลบ และแก้ไข ข้อมูลรถ ข้อมูลจะถูกเพิ่มและเก็บใน Database เพื่อที่จะนำไปใช้ต่อในการนำไปทำธุรกรรมการเช่าต่อ
</dd>
</dl>

![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Rent.png "Rent Interface")

<dl>
  <dt>Rent</dt>
  <dd>จะเป็นระบบการเช่ารถ (Rent) มีการเลือกเลขรหัสรถที่ถูกดึงมาจากส่วนของสต็อค จะมีการแจ้งสถานะรถคันนั้นว่าว่างหรือไม่ว่าง มีการกรอกเลขที่การเช่ารถ เพื่อระบุการเช่านั้นว่าอยู่ในรหัสสถานะเช่ารถใด กรอกรหัสลูกค้า เพื่อแสดงรายละเอียดของลูกค้า ระบุวันที่เช่ารถ และวันที่ต้องคืนรถ ลงจำนวนวันที่เช่า และมีการคำนวณค่าใช้จ่ายทั้งหมด
 
</dd>
</dl>

![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Repair.png "Repair Interface(2)")

<dl>
  <dt>Repair</dt>
  <dd> จะเป็นระบบการส่งซ่อมแซมรถ (Repair) เป็นการเลือกรหัสประจำรถ เพื่อทำการระบุว่ารถคันนั้นมีการเสียในส่วนใด มีประเภทการส่งซ่อมบำรุง ระบบเครื่องยนต์ ระบบส่งกำลัง ระบบไฟ ระบบของเหลว และในส่วนของล้อ/ยาง และสามารถกรอกรายละเอียดเพิ่มเติมได้ ระบุวันที่ซ่อมบำรุง และ วันหมดอายุของพรบ. เมื่อกดส่งซ่อมสถานะรถก็จะถูกแก้ไขเป็นไม่ว่างทันที เพื่อจะได้บริหารจัดการการซ่อมบำรุงและค่อยควบคุมงบประมาณค่าใช้จ่าย

</dd>
</dl>

![alt text](https://raw.githubusercontent.com/sahussawud/RentalMBS/master/readme/Return.png "Return Interface(2)")

<dl>
  <dt>Return</dt>
  <dd>จะเป็นระบบการคืนรถ (Return) โดยมีการกรอกรหัสสถานะการเช่ารถ แล้วรายละเอียดของลูกค้าก็จะถูกแสดงขึ้นมา ว่าเช่าวันไหน รหัสลูกค้าอะไร เลขพาหนะอะไร เลขไมล์เช่าก่อนถูกนำไปใช้อยู่ที่เท่าไหร่ จำนวนเงินมัดจำจำนวนกี่บาท และจะต้องกรอกว่าลูกค้านั้นนำรถมาคืนมีเลขไมล์เท่าไหร่ วันที่เท่าไหร่ที่นำรถมาคืน เกินวันที่เช่าไปกี่วัน  และจะถูกคำนวณออกมาเป็นค่าปรับ
</dd>
</dl>


