package com.dyx.acamp.models;

import java.util.List;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午3:16
 * alter person：dayongxin
 * alter time：16/7/15 下午3:16
 * alter remark：
 */
public class AppMainPageTop {
    /**
     * hasError : false
     * errorMessage : null
     * errorCode : null
     * data : {"carousel":[{"title":"21","picUrl":"http://58.247.11.230:6200/upload/032447f7-3758-4b46-9153-43b9d8873d5e.jpg","enabled":1,"sortIndex":1,"action":{"type":1,"data":null}},{"title":"1111","picUrl":"http://ecerp.ikitchen.cc:6200/upload/47669706-f9bd-4ee0-beb1-2ae6f6440988.png","enabled":1,"sortIndex":1,"action":{"type":2,"data":{"type":2,"target":"004ff9fa-ce2d-443a-a6ee-ee7baca598ce"}}},{"title":"聚餐会","picUrl":"http://ecerp.ikitchen.cc:6200/upload/987812f9-edb5-4d3c-9522-7d1db0de2bf1.jpg","enabled":1,"sortIndex":3,"action":{"type":1,"data":null}}],"recommendedContent":[]}
     */

    private boolean hasError;
    private Object errorMessage;
    private Object errorCode;
    private DataEntity data;

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        /**
         * title : 21
         * picUrl : http://58.247.11.230:6200/upload/032447f7-3758-4b46-9153-43b9d8873d5e.jpg
         * enabled : 1
         * sortIndex : 1
         * action : {"type":1,"data":null}
         */

        private List<CarouselEntity> carousel;
        private List<?> recommendedContent;

        public List<CarouselEntity> getCarousel() {
            return carousel;
        }

        public void setCarousel(List<CarouselEntity> carousel) {
            this.carousel = carousel;
        }

        public List<?> getRecommendedContent() {
            return recommendedContent;
        }

        public void setRecommendedContent(List<?> recommendedContent) {
            this.recommendedContent = recommendedContent;
        }

        public static class CarouselEntity {
            private String title;
            private String picUrl;
            private int enabled;
            private int sortIndex;
            /**
             * type : 1
             * data : null
             */

            private ActionEntity action;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getEnabled() {
                return enabled;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public int getSortIndex() {
                return sortIndex;
            }

            public void setSortIndex(int sortIndex) {
                this.sortIndex = sortIndex;
            }

            public ActionEntity getAction() {
                return action;
            }

            public void setAction(ActionEntity action) {
                this.action = action;
            }

            public static class ActionEntity {
                private int type;
                private Object data;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public Object getData() {
                    return data;
                }

                public void setData(Object data) {
                    this.data = data;
                }
            }
        }
    }
}
